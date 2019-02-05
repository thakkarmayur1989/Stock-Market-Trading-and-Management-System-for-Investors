/**
 * 
 */
package application;

/**
 * @author Dell
 *
 */
public class Stocks implements StockInt{

	int stockID;
	String stockName;
	int stockPrice;
	int currentDate;
	String stockHistory;
	
	@Override
	public double StockPrice() {
		return stockPrice;
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
