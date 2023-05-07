package com.something.agency.service;

import java.util.List;


public class TextService {

    /**
     * mergeStrings concatenates a list of string into a single one separated by a break-line.
     * @param elements a list of string
     * @return the concatenation of those strings, separated by a break-line.
     * null if elements is null
     */
    String mergeStrings(List<String> elements) {
        String result = "";
        for (String element : elements) {
            result += element + "\n";
        }
        return result;
    }
}
