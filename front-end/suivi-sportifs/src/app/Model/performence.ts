import { TranchAge } from './tranch-age';
import { Competition } from './competition';
import { Athlet } from './athlet';
import { Epreuve } from './epreuve';

export class Performence {
    id:number;
    date_competition:Date;
    athlete:Athlet;
    competition:Competition;
    tranch_age:TranchAge;
    epreuve:Epreuve;
    constructor(date_competition:Date,athlete:Athlet,competition:Competition,tranch_age:TranchAge,epreuve:Epreuve){
        this.date_competition=date_competition;
        this.athlete=athlete;
        this.competition=competition;
        this.epreuve=epreuve;
        this.tranch_age=tranch_age;
    }
}
