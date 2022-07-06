public class Apskritimas {
    private static double spindulys;

    public Apskritimas(double spindulys) {
        Apskritimas.spindulys = spindulys;
       if (spindulys > 0){
           System.out.println("Apskritimo ilgis yra " + ApskritimoIlgis() + " apskritimo plotis yra " + ApskritimoPlotas() + " apskririmo skersmuo yra " + ApskritimoSkersmuo());
       }else {
           System.out.println("Apskritimas su neigiamu spinduliu negalimas, Apskritimo ilgis yra " + ApskritimoIlgis() + " apskritimo plotis yra " + ApskritimoPlotas() + " apskririmo skersmuo yra " + ApskritimoSkersmuo());
       }

    }

    public double getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(double spindulys) {
        Apskritimas.spindulys = spindulys;

    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }

    public static double ApskritimoSkersmuo() {
        return spindulys * 2;
    }

    public static double ApskritimoPlotas() {
        return Math.PI * Math.pow(spindulys, 2);
    }

    public static double ApskritimoIlgis() {
        return 2 * Math.PI * spindulys;
    }
}
