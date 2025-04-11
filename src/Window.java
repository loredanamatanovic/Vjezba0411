public class Window implements metode {

    String naslov;
    String oznaka;
    int x1;
    int x2;
    int x3;
    int x4;
    String boja;

    public Window(String naslov) {
        naslov = this.naslov;
    }

    public String getNaslov() {
        return this.naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }


    public String width() {
        return "Širina je " + x1;
    }
     public String height() {
        return "Visina je" + x2;
     }
     public String area() {
        return "Površina prozora je " + (x1 * x2);
             }
             public String perimeter() {
        return "Opseg prozora je " + x1 + x2 + x3 + x4;
             }

}




