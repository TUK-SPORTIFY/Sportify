import styled from "styled-components";


export const NavContainer = styled.ul`
position: fixed;
bottom: 0;
width: 100%;
height: 8.6rem;
justify-content: center;
padding: 2rem;
align-items: center;
display: flex;
background-color:  var(--white);
box-shadow: 4px 0px 12px 0px rgba(0, 0, 0, 0.08);
`;

export const NavItem = styled.li`
width: 8.8rem;
display: flex;
flex-direction: column;
justify-content: space-between; 
align-items: center; 


`;
export const IconContainer = styled.div`
display: flex;
flex-direction: column;
align-items: center;



`;
export const NavIcon = styled.img`
width: 2.4rem;
height: 2.4rem;
flex-shrink: 0;
margin-bottom: 0.8rem;
`;

export const NavName = styled.p`
color: var(   --textC3);
&.active {
  color: var( --brandColor);
  }
font-size: 1.2rem;
font-style: normal;
font-weight: 400;
text-align: center;
width: 100%;
`;