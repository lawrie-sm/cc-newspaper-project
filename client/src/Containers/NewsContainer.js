import React, {Component} from 'react';
import Header from '../Components/Header';
import ArticleDetail from '../Components/ArticleDetail';
import AdminContainer from './AdminContainer';
import Main from '../Components/Main';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

class NewsContainer extends Component {

  constructor(props) {
    super(props);

    this.state = {
      articles: [],
      authors: [],
      categories: [ "World", "UK", "Sport", "Culture", "Education"],
      category: "",
      articleId: ""
    };
    this.setCategory = this.setCategory.bind(this);
    this.setArticle = this.setArticle.bind(this);
  }

  componentDidMount() {
    fetch("http://localhost:8080/articles/by-date")
      .then(res => res.json())
      .then(articles => this.setState({articles}))
      .catch(err => console.error);

    fetch("http://localhost:8080/authors")
      .then(res => res.json())
      .then(authors => this.setState({authors: authors._embedded.authors}))
      .catch(err => console.error);
  }

  setCategory(category){
    this.setState({category: category})
  }

  setArticle(article){
    console.log(article);
    this.setState({articleId: article})
  }

  render(){
    return(
      <Router>
        <React.Fragment>
          <h1>NewsContainer</h1>
          <Header />
          <Switch>
            <Route exact path="/"
              render={(props) => (
                <Main
                  categories = {this.state.categories}
                  setCategory = {this.setCategory}
                  articles = {this.state.articles}
                  filter={this.state.category}
                  setArticle = {this.setArticle}
                />
              )}
                />
                  <Route exact path="/admin"
                    render={(props) => (
                      <AdminContainer
                        articles = {this.state.articles}
                        authors = {this.state.authors}
                      />
                    )}
                      />
                        <Route
                          path="/article/:index"
                          render={(props) => <ArticleDetail article = {this.state.articles[this.state.articleId]} />}
                          />
                          </Switch>
                        </React.Fragment>
                      </Router>

    )}

}

export default NewsContainer;
