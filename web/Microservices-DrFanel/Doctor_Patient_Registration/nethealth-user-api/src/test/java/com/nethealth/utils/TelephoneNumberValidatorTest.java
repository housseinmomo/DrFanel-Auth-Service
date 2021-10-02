package com.nethealth.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TelephoneNumberValidatorTest {

	@Test
	void testValidateTelephone() {
		String telephone1 = "+211 47";
		String telephone2 = "14";
		String telephone3 = "0000007744";
		String telephone4 = "sed122";
		
		assertThat(TelephoneNumberValidator.validateTelephone(telephone1)).isTrue();
		assertThat(TelephoneNumberValidator.validateTelephone(telephone2)).isFalse();
		assertThat(TelephoneNumberValidator.validateTelephone(telephone3)).isTrue();
		assertThat(TelephoneNumberValidator.validateTelephone(telephone4)).isFalse();
	}

}
