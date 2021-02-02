public class ItsTimeFor {
    double time, money;
    String timeFor;
    public void setTime(double time){
        this.time = time;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public String NameValue(String value){
        String className = getClass().getSimpleName();
        return className + value;
    }
    public void ItsTimeForWhat(){
        if (time >= 22.0){
            timeFor = "Время идти спать!";
        } else if (time >= 19.0 & time < 22.0) {
            timeFor = "Время смотреть телевизор!";
        } else if (time > 12.0 & time < 19.0 & money < 50.0){
            timeFor = "Время идти к соседу!";
        } else if (time > 12.0 & time < 19.0 & money >= 50.0){
            timeFor = "Время идти в кафе!";
        } else if (time >= 8.0 & time <= 12.0 & money >= 10.0){
            timeFor = "Время идти в магазин!";
        } else {
            timeFor = "Не, ну тут я хз, честно";
        }
        System.out.println(timeFor);
    }

}
