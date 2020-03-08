class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {selectedFile: ''};
        this.onFileChangeHandler = this.onFileChangeHandler.bind(this);
    }


    onFileChangeHandler (event) {
        event.preventDefault();
        this.setState(
            {selectedFile: event.target.files[0]}
        );

        console.log(event.target.files[0]);
        // this.setState({
        //     selectedFile: event.target.files[0]
        // });
        const formData = new FormData();
        formData.append('file', event.target.files[0]);
        fetch('http://localhost:8080/upload', {
            method: 'post',
            body: formData
        }).then(res => {
            if(res.ok) {
                alert("File uploaded successfully.")
            }
        });
    };

    render(){
        return(
            <div className="container">
                <div className="row">
                    <div className="col-md-6">
                        <div className="form-group files color">
                            <label>Upload Your File </label>
                            <input type="file" className="form-control" name="file" onChange={this.onFileChangeHandler}/>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}
/*

class StudentTable extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        var students = this.props.students.map(student =>
            <Student key={student._links.self.href} student={student} deleteStudent={this.props.deleteStudent}/>
        );

        return (
            <div>
                <table className="table table-striped">
                    <thead>
                    <tr>
                        <th>Firstname</th><th>Lastname</th><th>Email</th><th> </th>
                    </tr>
                    </thead>
                    <tbody>{students}</tbody>
                </table>
            </div>);
    }
}

class Student extends React.Component {
    constructor(props) {
        super(props);
        this.deleteStudent = this.deleteStudent.bind(this);
    }

    deleteStudent() {
        this.props.deleteStudent(this.props.student);
    }

    render() {
        return (
            <tr>
                <td>{this.props.student.firstname}</td>
                <td>{this.props.student.lastname}</td>
                <td>{this.props.student.email}</td>
                <td>
                    <button className="btn btn-danger" onClick={this.deleteStudent}>Delete</button>
                </td>
            </tr>
        );
    }
}

class StudentForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {firstname: '', lastname: '', email: ''};
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleChange = this.handleChange.bind(this);
    }

    handleChange(event) {
        console.log("NAME: " + event.target.name + " VALUE: " + event.target.value)
        this.setState(
            {[event.target.name]: event.target.value}
        );
    }

    handleSubmit(event) {
        event.preventDefault();
        console.log("Firstname: " + this.state.firstname);
        var newStudent = {firstname: this.state.firstname, lastname: this.state.lastname, email: this.state.email};
        this.props.createStudent(newStudent);
    }

    render() {
        return (
            <div className="panel panel-default">
                <div className="panel-heading">Create student</div>
                <div className="panel-body">
                    <form className="form-inline">
                        <div className="col-md-2">
                            <input type="text" placeholder="Firstname" className="form-control"  name="firstname" onChange={this.handleChange}/>
                        </div>
                        <div className="col-md-2">
                            <input type="text" placeholder="Lastname" className="form-control" name="lastname" onChange={this.handleChange}/>
                        </div>
                        <div className="col-md-2">
                            <input type="text" placeholder="Email" className="form-control" name="email" onChange={this.handleChange}/>
                        </div>
                        <div className="col-md-2">
                            <button className="btn btn-success" onClick={this.handleSubmit}>Save</button>
                        </div>
                    </form>
                </div>
            </div>

        );
    }
}
*/

ReactDOM.render(<App />, document.getElementById('root') );