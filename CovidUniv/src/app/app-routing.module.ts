import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardUserComponent } from './board-user/board-user.component';
import { BoardDecideurComponent } from './board-decideur/board-decideur.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { CreateUserComponent} from './create-user/create-user.component'
import { DashboardComponent } from './dashboard/dashboard.component';
import { QuizComponent } from './quiz/quiz.component';
import { TestPCRComponent } from './test-pcr/test-pcr.component';
import { InfComponent } from './inf/inf.component';
import { UploadFileComponent } from './upload-file/upload-file.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'user', component: BoardUserComponent },
  { path: 'mod', component: BoardDecideurComponent },
  { path: 'admin', component: BoardAdminComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'update/:id', component: UpdateUserComponent },
  { path: 'addUser', component: CreateUserComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'quiz', component: QuizComponent },
  { path: 'testpcr', component: TestPCRComponent },
  { path: 'inf', component: InfComponent },
  { path: 'upload', component: UploadFileComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
