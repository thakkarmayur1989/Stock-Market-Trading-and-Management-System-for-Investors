/**
 * 
 */
package application;

/**
 * @author Dell
 *
 */
public class Portfolio implements StockInt {

	int stockID;
	String stockName;
	double buyPrice;
	String buyDate;
	int quantity;
	double amountInvested;
	int currentDate;
	double currentPrice;
	double amountToday;
	int indivProfitOrLoss;

	public Portfolio() {

	}

	@Override
	public double StockPrice() {
		return currentPrice;
		// TODO Auto-generated method stub

	}

	@Override
	public String StockName() {
		return stockName;
		// TODO Auto-generated method stub

	}

	@Override
	public int StockID() {
		return stockID;
		// TODO Auto-generated method stub

	}

}
