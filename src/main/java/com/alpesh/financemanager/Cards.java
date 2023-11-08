package com.alpesh.financemanager;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cards {
    private Integer cardNumber;
    private String cardName;
    private String bankName;
}
