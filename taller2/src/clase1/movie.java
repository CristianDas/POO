package clase1;

public class movie {
    private String nombre;
    private String categoria;
    int year;
    public int duration;
    public movie (){

    }
    public movie(String nombre, String categoria, int year, int duration) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.year = year;
        this.duration = duration;
    }

    
    public void mostrarmovie(){
        System.out.println("nombre de la pelicula es : " + this.nombre + " y la categoria es  " + this.categoria +"   el año en que se creo es   "+ this.year + "   su duracion es  " +  this.duration);

    }
        public void mostrarmovie (String nombre, String categoria, int year, int duration) {
            System.out.println("la categoria de la pelicula es " + this.categoria + "la duracion de la pelicula es " + this.duration + " el año en que se creo la pelicula es "  + this.year  + "el nombre de la pelicula es " + this.nombre) ;
            
        }

        public String getnombre (){ // metodo get o getter
            return nombre;
            }
            public String getcategoria (){
                return categoria;
            }
            public int getyear(){
                return year;
            }
                public int getduration(){
                    return duration;
                }


            
            public void  setnombre (String nombre){ // metodo set o setter
                this.nombre=nombre;

            }
    
            public void  setcategoria (String categoria){ // metodo set o setter
                this.categoria=categoria;


        }
        public void  setyear (int year){ // metodo set o setter
            this.year=year ;


    }
    public void  setduration (int  duration){ // metodo set o setter
        this.duration=duration;


}
    }


