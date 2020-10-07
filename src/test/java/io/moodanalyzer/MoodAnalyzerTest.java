package io.moodanalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void testAnalyseMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = "I am in Sad Mood";
		assertEquals("SAD",moodAnalyzer.analyseMood(mood));
	}

}