import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArtistesComponent } from './artistes/artistes.component';
import { CreateFanComponent } from './create-fan/create-fan.component';
import { EvenementsComponent } from './evenements/evenements.component';
import { FanListComponent } from './fan-list/fan-list.component';
import { UpdateFanComponent } from './update-fan/update-fan.component';
const routes: Routes = [
  
    
    {path:'fanlist', component:FanListComponent},
    {path:'addFan', component:CreateFanComponent},
    {path:'', redirectTo:'evenements', pathMatch:'full'},
    {path: 'updateFan/:id', component:UpdateFanComponent},
    {path:'artistes', component:ArtistesComponent},
    {path:'evenements', component:EvenementsComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
