public class Distancetravel {
    public static void main(String[] args) {
        double distanceTravel = 5.75;

        System.out.println("Masz do pokonania dystans " + distanceTravel+"km");
        if(distanceTravel <= 0.3){
            System.out.println(" pójdziesz pieszo");
        }else if(distanceTravel < 2.7 && distanceTravel > 0.3){
            System.out.println(" pojedziesz rowerem");
        }else if (distanceTravel < 1000 && distanceTravel > 2.7){
            System.out.println(" pojedziesz samochodem");
        }else if(distanceTravel > 1000){
            System.out.println(" polecisz samolotem");

        }
    }
}
