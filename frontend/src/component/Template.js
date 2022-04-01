import React from 'react';
import styled from 'styled-components';

const TemplateBlock = styled.div`
width: 600px;
height: 720px;

position: relative; 
background : white;
border : 2px solid black;
border-radius: 16px;
box-shadow: 0 0 8px 0 rgba(0, 0, 0, 0.04);

margin: 0 auto; /* 페이지 중앙에 나타나도록 설정 */

margin-top: 96px;
margin-bottom: 32px;
display: flex;
flex-direction: column;
// justify-content: space-between;

font-size: 24px;
font-family: '휴먼편지체';
`;

function Template({children}) {
    return <TemplateBlock>{children}쉽고 간단하게 메모하자</TemplateBlock>;
    // TODO 2022-03-29 폰트, 사이즈 조절 필요
}

export default Template;