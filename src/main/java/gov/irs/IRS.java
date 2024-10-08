package gov.irs;

public class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;
    public void register(TaxPayer taxPayer) {
        taxPayers[currentIndex++] = taxPayer;
    }
    public double computeTotalMonthlyTaxToCollect() {
        double total = 0;
        for (int i = 0; i < currentIndex; i++) {
            total += taxPayers[i].computeMonthlyTaxToPay();
        }
        return total;
    }

}
