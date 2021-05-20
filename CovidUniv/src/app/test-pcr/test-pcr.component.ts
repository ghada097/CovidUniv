import { Component, OnInit ,HostListener} from '@angular/core';
import { CovidService } from './../_services/covid.service';
import {Testpcr} from '../models/testpcr'


@Component({
  selector: 'app-test-pcr',
  templateUrl: './test-pcr.component.html',
  styleUrls: ['./test-pcr.component.css']
})
export class TestPCRComponent implements OnInit {
  testpcr: Testpcr = new Testpcr();
  submitted = false;
  constructor(private covidservice: CovidService) { }

  ngOnInit(): void {
  }
  newTest(): void {
    this.submitted = false;
    this.testpcr = new Testpcr();
  }

  save() {
    this.covidservice.createTest(this.testpcr)
      .subscribe(data => console.log(data), error => console.log(error));
    this.testpcr = new Testpcr();
  }
 
  onSubmit() {
    this.submitted = true;
    this.save();
  }


}
