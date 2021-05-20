import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TestPcrComponent } from './test-pcr.component';

describe('TestPcrComponent', () => {
  let component: TestPcrComponent;
  let fixture: ComponentFixture<TestPcrComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TestPcrComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TestPcrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
