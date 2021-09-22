package com.jitterted.ebp.blackjack.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GameOutcomeTest {

    @Test
    public void playerHitsAndGoesBustOutcomeIsPlayerIsBustedAndLoses() throws Exception {
        Deck stubDeck = new StubDeck(Rank.TEN, Rank.EIGHT,
                                     Rank.QUEEN, Rank.JACK,
                                     Rank.THREE);
        Game game = new Game(stubDeck);
        game.initialDeal();

        game.playerHits();
        game.dealerTurn();

        assertThat(game.determineOutcome())
                .isEqualTo("You Busted, so you lose.  💸");
    }
}