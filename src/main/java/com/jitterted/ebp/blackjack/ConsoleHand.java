package com.jitterted.ebp.blackjack;

import java.util.stream.Collectors;

import static org.fusesource.jansi.Ansi.ansi;

public class ConsoleHand {

    // Take a DOMAIN OBJECT and return (translate/transform/map) DTO (in this case a String is good enough)
    static String displayFirstCard(Hand hand) {
        return ConsoleCard.display(hand.firstCard());
    }

    public static String cardsAsString(Hand hand) {
        return hand.cards().stream()
                   .map(ConsoleCard::display)
                   .collect(Collectors.joining(
                            ansi().cursorUp(6).cursorRight(1).toString()));
    }
}