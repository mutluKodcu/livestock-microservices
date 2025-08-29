import React,{useState,useEffect} from 'react'
import axios from 'axios'
import {BarChart,Bar,XAxis,YAxis,Tooltip,ResponsiveContainer} from 'recharts'
export default function Dashboard(){
  const [animals,setAnimals]=useState([])
  useEffect(()=>{ axios.get('http://localhost:8081/api/animals').then(r=>setAnimals(r.data)).catch(()=>{}); },[])
  const data = Object.values(animals.reduce((acc,a)=>{ acc[a.farmId]=acc[a.farmId]||{farmId:a.farmId,count:0}; acc[a.farmId].count++; return acc; },{}))
  return (<div><h2>Animals by Farm</h2><div style={{width:'100%',height:300}}><ResponsiveContainer><BarChart data={data}><XAxis dataKey='farmId'/><YAxis/><Tooltip/><Bar dataKey='count' /></BarChart></ResponsiveContainer></div></div>)
}
