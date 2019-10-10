import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import { PageNotFoundComponent } from "./page-not-found/page-not-found.component";
import { HomeComponent } from "./home/home.component";
import { UsersComponent } from "./users/users.component";
import { UserComponent } from "./users/user/user.component";
import { ServersComponent } from "./servers/servers.component";
import { ServerComponent } from "./servers/server/server.component";
import { EditServerComponent } from "./servers/edit-server/edit-server.component";

const appRoutes: Routes = [
    // Home Page
    { path: '', component: HomeComponent },
    // Users Page 
    { path: 'users', component: UsersComponent, children: [
      // Single User Page
      { path: ':id/:name', component: UserComponent },
    ] },
    // Servers Page 
    { path: 'servers', component: ServersComponent, children: [
        // Single Server Page 
      { path: ':id', component: ServerComponent }, 
      // Edit Server Page
      { path: ':id/edit', component: EditServerComponent } 
    ] },
    {path: 'not-found', component: PageNotFoundComponent},
    {path: '**', redirectTo: '/not-found'}
];

@NgModule({
    imports: [
       RouterModule.forRoot(appRoutes) 
    ],
    exports: [RouterModule]
})

export class AppRoutingModule {

}