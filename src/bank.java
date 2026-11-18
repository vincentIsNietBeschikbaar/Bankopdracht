public class bank {
    public float money;

    public bank(float money){
        this.money = money;
    }

    public void opname(float subtract_amount){
        if (this.money >= subtract_amount){
            this.money -= subtract_amount;
        }else{
            System.out.println("niet genoeg geld");
        }
    }

    public void storting(float newmoney){
        this.money += newmoney;
    }

    public void laatGeldZien(){
        System.out.println(this.money);
    }
}