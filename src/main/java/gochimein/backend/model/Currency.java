package gochimein.backend.model;

import javax.persistence.Entity;

@Entity
public class Currency extends BaseModel{
	
	private int currencyOffset;
	
	private String userCurrency;
	
	private float usdExchange;
	
	private float usdExchangeInverse;

	public int getCurrencyOffset() {
		return currencyOffset;
	}

	public void setCurrencyOffset(int currencyOffset) {
		this.currencyOffset = currencyOffset;
	}

	public String getUserCurrency() {
		return userCurrency;
	}

	public void setUserCurrency(String userCurrency) {
		this.userCurrency = userCurrency;
	}

	public float getUsdExchange() {
		return usdExchange;
	}

	public void setUsdExchange(float usdExchange) {
		this.usdExchange = usdExchange;
	}

	public float getUsdExchangeInverse() {
		return usdExchangeInverse;
	}

	public void setUsdExchangeInverse(float usdExchangeInverse) {
		this.usdExchangeInverse = usdExchangeInverse;
	}

}

