"use client"

import {useEffect} from "react";
const query = `
    query {
        books {
            id
            pageCount
            author {
              name
            }
        }
    }
`

export default function Home() {
  useEffect(() => {
    const options = {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ query })
    }
    fetch("http://localhost:8080/graphql", options)
        .then(res => res.json())
        .then(data => console.log(data.data.books))
        .catch(err => console.log(err))
        .finally(() => {

        })
  });
  return "Hello"
}
