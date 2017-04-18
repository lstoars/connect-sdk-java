/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudResults;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_NonSepaDirectDebitPaymentMethodSpecificOutput">NonSepaDirectDebitPaymentMethodSpecificOutput</a>
 */
public class NonSepaDirectDebitPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

	private FraudResults fraudResults = null;

	public FraudResults getFraudResults() {
		return fraudResults;
	}

	public void setFraudResults(FraudResults value) {
		this.fraudResults = value;
	}
}