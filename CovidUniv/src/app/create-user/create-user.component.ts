import { UsersService } from './../_services/users.service';
import { User } from './../models/user';
import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from '../_services/token-storage.service';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {
  currentUser: any;
  user: User = new User();
  submitted = false;

  constructor(private token: TokenStorageService,private usersservice: UsersService) { }

  ngOnInit() {
    this.currentUser = this.token.getUser();
  }
 
  newUser(): void {
    this.submitted = false;
    this.user = new User();
  }
 
  save() {
    this.usersservice.createuser(this.user)
      .subscribe(data => console.log(data), error => console.log(error));
    this.user = new User();
  }
 
  onSubmit() {
    this.submitted = true;
    this.save();
  }

}
