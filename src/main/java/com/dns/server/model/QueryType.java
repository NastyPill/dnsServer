package com.dns.server.model;

import lombok.Getter;

@Getter
public enum QueryType {

    A(1), AAAA(28), MX(15), TXT(16);

    private int value;

    QueryType(int value) {
        this.value = value;
    }

    public static int valueOf(QueryType queryType) {
        return queryType.value;
    }

    public static QueryType valueOf(int code) {
        for (QueryType queryType: QueryType.values()) {
            if(queryType.value == code) {
                return queryType;
            }
        }
        throw new IllegalArgumentException("No such queryType");
    }

}
