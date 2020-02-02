import { HistoriqueEntite } from './historique-entite';
import { Athlet } from './athlet';
export class Athplushisto {
    athlete:Athlet;
    historique_entite:HistoriqueEntite;
    constructor(athlete:Athlet,historique_entite:HistoriqueEntite){
        this.athlete=athlete;
        this.historique_entite=historique_entite;
}
}