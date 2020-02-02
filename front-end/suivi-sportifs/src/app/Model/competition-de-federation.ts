import { Federation } from './federation';

export class CompetitionDeFederation {
    id?:number;
    federation: Federation;
constructor(federation:Federation){
    this.federation=federation;
}
}
