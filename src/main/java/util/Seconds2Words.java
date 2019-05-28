package util;


public class Seconds2Words {

    public String convert(int totalSeconds) {

        String result = "";
        //seconds
        if (totalSeconds < 60) {
            int seconds = totalSeconds % 60;
            StringBuilder sb = new StringBuilder();
            stringBuilderForSeconds(seconds, sb);
            result = sb.toString();
        }

        //whole minutes and hours
        if ((totalSeconds % 60 == 0) && totalSeconds > 0) {
            int hours = totalSeconds / 60;
            int minutes = hours % 60;
            hours = hours / 60;
            StringBuilder sb = new StringBuilder();
            stringBuilderForHours(totalSeconds, hours, sb);
            stringBuilderForMinutes(minutes, sb);
            result = sb.toString();
        }

        //seconds, minutes and hours
        if (totalSeconds > 60 && !(totalSeconds % 60 == 0)) {
            int seconds = totalSeconds % 60;
            int hours = totalSeconds / 60;
            int minutes = hours % 60;
            hours = hours / 60;

            StringBuilder sb = new StringBuilder();
            stringBuilderForHours(totalSeconds, hours, sb);
            stringBuilderForMinutes(minutes, sb);
            sb.append(", ");
            stringBuilderForSeconds(seconds, sb);
            result = sb.toString();
        }
        return result;
    }

    //methods
    private void stringBuilderForSeconds(int seconds, StringBuilder sb) {
        sb.append(seconds);
        sb.append(' ');
        sb.append("second");
        if (seconds > 1 || seconds == 0) {
            sb.append('s');
        }
    }

    private void stringBuilderForMinutes(int minutes, StringBuilder sb) {
        sb.append(minutes);
        sb.append(' ');
        sb.append("minute");
        if (minutes > 1 || minutes == 0) {
            sb.append('s');
        }
    }

    private void stringBuilderForHours(int totalSeconds, int hours, StringBuilder sb) {
        if (totalSeconds > 3600) {
            sb.append(hours);
            sb.append(' ');
            sb.append("hour");
            if (hours > 1 || hours == 0) {
                sb.append('s');
            }
            sb.append(", ");
        }
    }
}
