import { Component, Input, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { UsersService } from '../_services/users.service';
import { from, Observable } from 'rxjs';
import {User} from '../models/user'
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-board-admin',
  templateUrl: './board-admin.component.html',
  styleUrls: ['./board-admin.component.css']
})
export class BoardAdminComponent implements OnInit {
  users: Observable<User[]>;
  @Input() user: User;
  content: string;

  constructor(private userService: UserService,private usersService: UsersService,private route: ActivatedRoute,
    private router: Router,) { }

  ngOnInit(): void {
    this.reloadData();
    this.usersService.getusersList().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
  }
  reloadData() {
    this.users = this.usersService.getusersList();
  }

 updateUser(id: number){
    this.router.navigate(['update', id]);
  }

}
