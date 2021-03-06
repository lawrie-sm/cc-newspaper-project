import React from 'react';
import './Categories.css';


const Categories = (props) => {
  const buttonNodes = props.categories.map((value, i) => (
      <button value={value} key={i} className={props.selectedCategory == value ? "selectedCategoryButton" : "categoryButton" } onClick={handleClick}>{value}</button>
  ));

  function handleClick(evt){
    props.setCategory(evt.target.value);
  }

  return(
    <div className="categories-container">
      <button value="" onClick={handleClick} className={props.selectedCategory == "" ? "selectedCategoryButton" : "categoryButton" }>ALL</button>
      {buttonNodes}
    </div>
  )
}

export default Categories;
