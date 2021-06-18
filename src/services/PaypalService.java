package services;

public class PaypalService implements OnlinePaymentService {
	
	public static final double PF = 0.02;
	public static final double INT = 0.01;

	//PAYMENT_FEE = TAXA DE PAGAMENTO (2%)
	//INTEREST = JUROS SIMPLES (1%)
	
	@Override
	public double paymentFee(double amount) {
		return amount * PF;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * INT * months;
	}
}
