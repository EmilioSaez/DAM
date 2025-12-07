public class Main {
    public static void main(String[] args) {
        Call [] calls= {
                new Call(625155166,7824174,30,4,true),
                new Call(78218127,8217382,80,1,false),
                new Call(29388193,38217378,100,2,true),
                new Call(2130123,2132132134,500,2,true)
        };
        Switchboard switchboard = new Switchboard();
        for (int i = 0; i < calls.length; i++) {
            switchboard.registerCall(calls[i]);
        }
        System.out.println(switchboard.getTotalCalls()+" Calls");
        System.out.println(switchboard.getTotalPrice(calls)+" cents");

    }
}
