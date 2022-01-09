package ru.vsu.cs.avdeeva_p_a;

import org.junit.Assert;
import org.junit.Test;
import Utils.utils;


import java.io.FileNotFoundException;

public class Tests {

    @Test
    public void testingSentencesWithDot() throws FileNotFoundException {
        String testingInputText = utils.readStringFromFile("TestCase/SentencesWithDot.txt");
        String actualText = NumberingOfSentences.numberingOfSentences(testingInputText);
        String correctText = utils.readStringFromFile("TestAnswers/answerForSentenceWithDot.txt");
        Assert.assertEquals(correctText, actualText);
    }

    @Test
    public void testingSentencesWithExclamationMark() throws FileNotFoundException {
        String testingInputText = utils.readStringFromFile("TestCase/SentencesWithExclamationMark.txt");
        String actualText = NumberingOfSentences.numberingOfSentences(testingInputText);
        String correctText = utils.readStringFromFile("TestAnswers/answerForSentencesWithExclamationMark.txt");
        Assert.assertEquals(correctText, actualText);
    }

    @Test
    public void testingSentencesWithDifferentSigns() throws FileNotFoundException {
        String testingInputText = utils.readStringFromFile("TestCase/SentencesWithDifferentSigns.txt");
        String actualText = NumberingOfSentences.numberingOfSentences(testingInputText);
        String correctText = utils.readStringFromFile("TestAnswers/answerForSentencesWithDifferentSigns.txt");
        Assert.assertEquals(correctText, actualText);
    }

    @Test
    public void testingSentencesWithoutSignAtEnd() throws FileNotFoundException {
        String testingInputText = utils.readStringFromFile("TestCase/SentencesWithoutSignAtEnd.txt");
        String actualText = NumberingOfSentences.numberingOfSentences(testingInputText);
        String correctText = utils.readStringFromFile("TestAnswers/answerForSentencesWithoutSignAtEnd.txt");
        Assert.assertEquals(correctText, actualText);
    }

    @Test
    public void testingSentencesWithQuestionMark() throws FileNotFoundException {
        String testingInputText = utils.readStringFromFile("TestCase/SentencesWithQuestionMark.txt");
        String actualText = NumberingOfSentences.numberingOfSentences(testingInputText);
        String correctText = utils.readStringFromFile("TestAnswers/answerForSentencesWithQuestionMark.txt");
        Assert.assertEquals(correctText, actualText);
    }
}
