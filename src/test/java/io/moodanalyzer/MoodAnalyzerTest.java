package io.moodanalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void testAnalyseMood() {
		
		String message = "Iam in sad Mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);
		assertEquals("SAD", moodAnalyzer.analyseMood());
	}
}