package io.moodanalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void testAnalyseMood() {
		
		String message = "Iam in Any Mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);
		assertEquals("HAPPY", moodAnalyzer.analyseMood());
	}
}