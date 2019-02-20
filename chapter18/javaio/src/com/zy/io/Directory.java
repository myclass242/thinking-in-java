package com.zy.io;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Directory {
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> {
        private List<File> files = new ArrayList<>();
        private List<File> dirs = new ArrayList<>();

        public Iterator<File> iterator() {
            return files.iterator();
        }
        void addAll(TreeInfo oth) {
            files.addAll(oth.files);
            dirs.addAll(oth.dirs);
        }
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append("Files:");
            for (File f : files) {
                str.append(f.getName() + " ");
            }
            str.append("\nDirs:");

            for (File f : dirs) {
                str.append(f.getName() + " ");
            }
            return str.toString();
        }
        static TreeInfo recurseDirs(File startDir, String regex) {
            TreeInfo result = new TreeInfo();
            for (File item : startDir.listFiles()) {
                if (item.isDirectory()) {
                    result.dirs.add(item);
                    result.addAll(recurseDirs(item, regex));
                } else {
                    if (item.getName().matches(regex))
                        result.files.add(item);
                }
            }
            return result;
        }
        public static TreeInfo walk(String start, String regex) {
            return recurseDirs(new File(start), regex);
        }
        public static TreeInfo walk(File dir, String regex) {
            return recurseDirs(dir, regex);
        }
        public static TreeInfo walk(String start) {
            return recurseDirs(new File(start), ".*");
        }
        public static TreeInfo walk(File start) {
            return recurseDirs(start, ".*");
        }
    }

    public static void main(String[] args) {
        System.out.println(TreeInfo.walk("."));
        PrintWriter is;
    }
}
