package country;




import java.util.Arrays;

    public class GeoPolitical {
        private String geopolitical_Zone;

        public void setgeopolitical_Zone(String geopolitical_Zone) {
            this.geopolitical_Zone = geopolitical_Zone.toUpperCase().trim();
        }


        public Object [] getState(String geopolitical_Zone) {
            this.setgeopolitical_Zone(geopolitical_Zone);
            NorthCentral [] states1 = NorthCentral.values();
            NorthEast [] states2 = NorthEast.values();
            NorthWest [] states3 = NorthWest.values();
            SouthEast [] states4 = SouthEast.values();
            SouthSouth [] states5 = SouthSouth.values();
            SouthWest [] states6 = SouthWest.values();
            switch (geopolitical_Zone) {
                case "NorthCentral":
                    return states1;
                case "NorthEast":
                    return states2;
                case "NorthWest":
                    return states3;
                case "SouthEast":
                    return states4;
                case "SouthSouth":
                    return states5;
                case "SouthWest":
                    return states6;
                default: throw new IllegalArgumentException("Invalid geopolitical Zone");
            }
        }



    }


}
