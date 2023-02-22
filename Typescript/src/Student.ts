interface Person {
  getName(): string;
  activity(): void;
}

class Student implements Person {
  name: string;
  school: string;

  constructor( name: string, school: string) {
    this.name = name;
    this.school = school;
  }
  getName():string { return this.name; }
  activity(): void { console.log("Studying"); } 
}

class CMUStudent extends Student {
  andrewID: string;
  constructor( name: string, andrewID: string){
       super(name, "CMU");
       this.andrewID = andrewID; 
   }

   activity(): void { this.study(); }
   study(): void { console.log("Studying harder"); }
}