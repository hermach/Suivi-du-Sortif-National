export class Athlet {
    
    id?:  number ;
    nom: String;
    prenom:String;
    date_de_naissance:Date;
    image:String;
constructor(nom:String,prenom:String,date_de_naissance:Date,image:String){
this.nom=nom;
this.prenom=prenom;
this.date_de_naissance=date_de_naissance;
this.image=image;
}
}

