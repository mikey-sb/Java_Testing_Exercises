public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheetsRemaining() {
        return this.sheets;
    }

    public void print(int pages, int copies){
        if (this.sheets >= (pages*copies)){
        int totalSheets = pages * copies;
        this.sheets -= totalSheets;
        this.toner -= totalSheets;
        }
    }

    public int getToner(){
        return(this.toner);
    }


}
