package com.nedink.words.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class WordsService {

    public WordsService() {
    }

    public long getCount() {
        InputStream inputStream = null;
        Stream<String> wordStream = null;

        try {
            File file = new File(getClass()
                    .getClassLoader()
                    .getResource("words.txt").getFile());
            inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            wordStream = reader.lines();

            return wordStream.count();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return -1;
    }

    public long getCountByRegex(String regex) {
        InputStream inputStream = null;

        try {
            File file = new File(getClass()
                    .getClassLoader()
                    .getResource("words.txt").getFile());
            inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            Stream<String> wordStream = reader.lines();
            Stream<String> matches = wordStream.filter(word -> word.matches(regex));
            return Arrays.asList(matches.toArray()).size();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return -1;
    }

    public List getByRegex(String regex) {
        InputStream inputStream = null;

        try {

            File file = new File(getClass()
                    .getClassLoader()
                    .getResource("words.txt").getFile());
            inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            Stream<String> wordStream = reader.lines();
            Stream<String> matches = wordStream.filter(word -> word.matches(regex));
            return Arrays.asList(matches.toArray());

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
