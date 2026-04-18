package com.example.nestedlist.service;

import com.example.nestedlist.dto.*;
import com.example.nestedlist.parser.*;
import org.springframework.stereotype.Service;

@Service
public class ParserService {

    private final NestedListParser parser = new NestedListParser();

    public ParseResponse parse(ParseRequest request) {
        ListComponent result = parser.parse(request.getInput());
        Object json = convertToJson(result);
        return new ParseResponse(json);
    }

    // Convert tree → JSON-friendly structure
    private Object convertToJson(ListComponent component) {
        if (component instanceof Item) {
            return ((Item) component).getValue();
        }

        ListComposite composite = (ListComposite) component;
        java.util.List<Object> list = new java.util.ArrayList<>();

        for (int i = 0; i < composite.getChildCount(); i++) {
            list.add(convertToJson(composite.getChild(i)));
        }

        return list;
    }
}