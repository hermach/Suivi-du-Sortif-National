import { ChartPerComponent } from './modules/chart-per/chart-per.component';
import { PerformenceComponent } from './modules/performence/performence.component';
import { TranchAgeComponent } from './modules/tranch-age/tranch-age.component';
import { AjoutajoutepreuveComponent } from './modules/ajoutajoutepreuve/ajoutajoutepreuve.component';
import { AjoutCompetitionComponent } from './modules/ajout-competition/ajout-competition.component';
import { AjoutCritreComponent } from './modules/ajout-critre/ajout-critre.component';
import { AllAthletsComponent } from './modules/all-athlets/all-athlets.component';
import { AjoutAthletComponent } from './modules/ajout-athlet/ajout-athlet.component';
import { EntitiesSportifsComponent } from './modules/entities-sportifs/entities-sportifs.component';
import { AjoutSportComponent } from './modules/ajout-sport/ajout-sport.component';
import { LoginComponent } from './auth-pages/login/login.component';
import { DetailFederationComponent } from './modules/detail-federation/detail-federation.component';
import { AjouteFederationComponent } from './modules/ajoute-federation/ajoute-federation.component';
import { DashboardComponent } from './modules/dashboard/dashboard.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DefaultComponent } from './layouts/default/default.component';
import { PostsComponent } from './modules/posts/posts.component';
import { AjoutEntitySportifComponent } from './modules/ajout-entity-sportif/ajout-entity-sportif.component';
import { OneAthletComponent } from './modules/one-athlet/one-athlet.component';


const routes: Routes = [{
  path: '',
  component: DefaultComponent,
  children: [{
    path: '',
    component: DashboardComponent,
  },
  {
    path: 'posts',
    component: PostsComponent,},
    {path:'ajoutefederation',
    component:AjouteFederationComponent},
    {path:'detaill-federation/:id',
    component:DetailFederationComponent},
    {path:'login',
    component:LoginComponent},
    {path:'ajoutesport/:id',
    component:AjoutSportComponent},
    {path:'entities-sportifs/:id',
    component:EntitiesSportifsComponent},
    {path:'ajouteathlets/:id',
    component:AjoutAthletComponent},
    {path:'all-athlets/:id',
    component:AllAthletsComponent},
    {path:'ajout-entity-sportif/:id',
    component:AjoutEntitySportifComponent},
    {path:'one-athlet/:id',
    component:OneAthletComponent},
    {path:'ajout-critre/:id',
    component:AjoutCritreComponent},
    {path:'ajout-competition/:id',
     component:AjoutCompetitionComponent},
    {path:'ajoutepreuve/:id',
      component:AjoutajoutepreuveComponent },
    {path:'tranch-age',
      component:TranchAgeComponent},
    {path:'performence/:id',
     component:PerformenceComponent},
     {path:'chart-per',
      component:ChartPerComponent}
    
  ],
},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
