public class Switchboard {
    private Call calls[];
    private int conter;

    public Switchboard(){
        calls=new Call[1000];
        conter=0;
        for (int i = 0; i < calls.length; i++) {
            calls[i]=null;
        }
    }
    public void registerCall(Call call){
        calls[conter]=call;
        conter++;
    }
    public float getTotalPrice(Call[] call){
        float totalPriceAccum=0;
        for (int i = 0; i < conter; i++) {
            if (calls[i]!=null) {
                totalPriceAccum+=calls[i].getPrice();
            }
        }
        return totalPriceAccum;
    }
    public int getTotalCalls() {
        return conter;
    }

}
