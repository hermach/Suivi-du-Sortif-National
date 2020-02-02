import { ArrayType } from '@angular/compiler';

export class Federation {
    id:  number ;
    description: String;
    image: String;
    nom: String;
    president : String;
    list_sports:ArrayType;
    constructor(id:number){
this.id=id;
    }
}
