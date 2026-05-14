import { Routes } from '@angular/router';
import { LaptopsComponent } from './laptops/laptops.component';
import { canActivateAuthRole } from './guards/auth-role.guard';
import { Forbidden } from './forbidden/forbidden';
import { UserProfileComponent } from './user-profile/user-profile';

export const routes: Routes = [

    {
        path: "laptops",
        component: LaptopsComponent,
        canActivate: [canActivateAuthRole],
        data: { role: 'ADMIN' }
    },
    {
        path: 'profile',
        component: UserProfileComponent
    },
    { path: 'forbidden', component: Forbidden }

]; 