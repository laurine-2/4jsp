package com.something.agency.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TextServiceTest {
    // TODO add some tests here
	private TextService textService = new TextService();
	@Test
	public void TestAddService() {
		List<String> listService = new ArrayList<String>();
		listService.add("laurine");
		listService.add("miriam");
		listService.add("jordan");
		String result = "laurine\nmiriam\njordan\n";
		String value = textService.mergeStrings(listService);
		assertEquals(result, value);
		
	}
}