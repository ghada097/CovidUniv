import { UserService } from './../_services/user.service';
import {UsersService} from  './../_services/users.service'
import { User } from './../models/user';
import { Component, OnInit,HostListener} from '@angular/core';
import { TokenStorageService } from '../_services/token-storage.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiResponse } from '../api.response';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
  currentUser: any;
  id: number;
  user: User;
  apiResponse:ApiResponse;

  constructor(private token: TokenStorageService,private route: ActivatedRoute,private router: Router,
    private userService: UserService, private userService2: UsersService) { }

  ngOnInit(): void {
    this.currentUser = this.token.getUser();
    this.user = new User();

    this.id = this.route.snapshot.params['id'];
    this.userService2.getuserbyId(this.id)
      .subscribe(data => {
        console.log(data)
        this.user = data;
      }, error => console.log(error));
  }
  onSubmit() {
    this.userService2.updateuser(this.id,this.user)
      .subscribe(data => console.log(data), error => console.log(error));
    this.user = new User();
    this.router.navigate(['/admin']);
    }

}
