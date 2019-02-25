package com.zy.enums;

import java.util.*;

class Mail {
    enum GeneralDeliver {YES, NO1, NO2, NO3, NO4, NO5}
    enum Scannability {UNSCANNABLE, YES1, YES2, YES3, YES4}
    enum Readability {ILLEGIBLE, YES1, YES2, YES3, YES4}
    enum Address {INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6}
    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5}
    GeneralDeliver generalDeliver;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;
    static long count = 0;
    long id = count++;
    public String toString() {
        return "Mail: " + id;
    }
    public String details() {
        return toString() +
                ", General Deliver: " + generalDeliver +
                ", Address Scannablity " + scannability +
                ", Address Readability " + readability +
                ", Address Address " + address +
                ", Return Address " + returnAddress;
    }
    public static Mail randomMail() {
        Mail m = new Mail();
        m.generalDeliver = Enums.random(GeneralDeliver.class);
        m.scannability = Enums.random(Scannability.class);
        m.readability = Enums.random(Readability.class);
        m.address = Enums.random(Address.class);
        m.returnAddress = Enums.random(ReturnAddress.class);
        return m;
    }
    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    public boolean hasNext() {
                        return n-- > 0;
                    }
                    public Mail next() {
                        --n;
                        return randomMail();
                    }
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class PostOffice {
    enum MailHandler {
        GENERAL_DELIVER {
            @Override
            boolean handle(Mail m) {
                switch (m.generalDeliver) {
                    case YES : {
                        System.out.println("Using general delivery for " + m);
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
        },
        MACHINE_SCAN {
            @Override
            boolean handle(Mail m) {
                switch (m.scannability) {
                    case UNSCANNABLE: {
                        return false;
                    }
                    default: {
                        switch (m.address) {
                            case INCORRECT: {
                                return false;
                            }
                            default: {
                                System.out.println("Delivering " + m + "automatically");
                                return true;
                            }
                        }
                    }
                }
            }
        },
        VISUAL_INSPECTION {
            @Override
            boolean handle(Mail m) {
                switch (m.readability) {
                    case ILLEGIBLE: {
                        return false;
                    }
                    default: {
                        switch (m.address) {
                            case INCORRECT: {
                                return false;
                            }
                            default: {
                                System.out.println("Delivering " + m + "normally");
                                return true;
                            }
                        }
                    }
                }
            }
        },
        RETURN_TO_SENDER {
            @Override
            boolean handle(Mail m) {
                switch (m.returnAddress) {
                    case MISSING: {
                        return false;
                    }
                    default: {
                        System.out.println("Returning " + m + "to sender");
                        return true;
                    }
                }
            }
        };

        abstract boolean handle(Mail m);
    }
    static void handler(Mail m) {
        for (MailHandler handler : MailHandler.values()) {
            if (handler.handle(m)) {
                return;
            }
        }
        System.out.println(m + " is dead letter");
    }

    public static void main(String[] args) {
        for (Mail m : Mail.generator(10)) {
            System.out.println(m.details());
            handler(m);
            System.out.println("******");
        }
    }
}
